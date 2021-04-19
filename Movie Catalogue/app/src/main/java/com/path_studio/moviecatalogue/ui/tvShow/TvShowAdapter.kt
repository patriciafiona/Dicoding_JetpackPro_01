package com.path_studio.moviecatalogue.ui.tvShow

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.path_studio.moviecatalogue.R
import com.path_studio.moviecatalogue.data.TvShowEntity
import com.path_studio.moviecatalogue.databinding.ItemsMovieTvshowBinding
import com.path_studio.moviecatalogue.ui.detailTvShow.DetailTvShowActivity

class TvShowAdapter: RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>() {

    private var listTvShows = ArrayList<TvShowEntity>()

    fun setTvShow(shows: List<TvShowEntity>?) {
        if (shows == null) return
        this.listTvShows.clear()
        this.listTvShows.addAll(shows)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val itemsTvShowBinding = ItemsMovieTvshowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(itemsTvShowBinding)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        val show = listTvShows[position]
        holder.bind(show)
    }

    override fun getItemCount(): Int = listTvShows.size


    class TvShowViewHolder(private val binding: ItemsMovieTvshowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(show: TvShowEntity) {
            with(binding) {
                tvItemTitle.text = show.title

                tvItemDate.text = show.seasonDetails[show.seasonDetails.size -1].sessionPremiere

                tvItemRating.rating = show.rating.toFloat()/20

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailTvShowActivity::class.java)
                    intent.putExtra(DetailTvShowActivity.EXTRA_TV_SHOW, show.id)
                    itemView.context.startActivity(intent)
                }

                Glide.with(itemView.context)
                        .load(show.posterURL)
                        .apply(
                                RequestOptions.placeholderOf(R.drawable.ic_loading)
                                        .error(R.drawable.ic_error))
                        .into(imgPoster)
            }
        }
    }

}