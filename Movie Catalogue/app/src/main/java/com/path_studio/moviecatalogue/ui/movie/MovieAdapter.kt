package com.path_studio.moviecatalogue.ui.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.path_studio.moviecatalogue.R
import com.path_studio.moviecatalogue.data.MovieEntity
import com.path_studio.moviecatalogue.databinding.ItemsMovieTvshowBinding
import com.path_studio.moviecatalogue.ui.detailMovie.DetailMovieActivity
import com.path_studio.moviecatalogue.util.Utils

class MovieAdapter: RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private var listMovies = ArrayList<MovieEntity>()

    fun setMovies(movies: List<MovieEntity>?) {
        if (movies == null) return
        this.listMovies.clear()
        this.listMovies.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemsMovieBinding = ItemsMovieTvshowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemsMovieBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val course = listMovies[position]
        holder.bind(course)
    }

    override fun getItemCount(): Int = listMovies.size


    class MovieViewHolder(private val binding: ItemsMovieTvshowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieEntity) {
            with(binding) {
                tvItemTitle.text = movie.title
                tvItemDate.text = Utils.changeStringToDateFormat(movie.releaseDate)

                tvItemRating.rating = movie.rating.toFloat()/20

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailMovieActivity::class.java)
                    intent.putExtra(DetailMovieActivity.EXTRA_MOVIE, movie.id)
                    itemView.context.startActivity(intent)
                }

                Glide.with(itemView.context)
                    .load(movie.posterURL)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error))
                    .into(imgPoster)
            }
        }
    }

}