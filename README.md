# Dicoding_JetpackPro_01

<p align="center">
  <img src="https://user-images.githubusercontent.com/32255348/117400550-1a9fc700-af2d-11eb-9e41-52c2eb8bdbed.gif" width="300" />
</p>

<p align="center"><i><b>Figure 1</b> Preview of The Movie Database App</i></p>

<br/>

Result of Renew my Dicoding: "Belajar Android Jetpack Pro" Certificate (Submission 01: Architecture Component)

## Information
<p align="center">
  <img src="https://www.xda-developers.com/files/2021/03/Android-Jetpack.jpg" width="500"/>
</p>
<p align="center"><i><b>Figure 2</b> Android Jetpack Logo</i></p>

Type                  : Submission 01

Platform              : Mobile - [Android](https://www.android.com/intl/id_id/)

Programming Language  : [Kotlin](https://developer.android.com/kotlin?hl=id)

Dicoding Class        : [Belajar Android Jetpack Pro](https://www.dicoding.com/academies/129)

## Testing Schenario - Indonesia language
Adapun detail skenario testing aplikasi ini adalah sebagai berikut:

- DetailMovieViewModelTest
  - Memuat Movie
    - Memastikan data movie tidak null
    - Memastikan jumlah data movie sesuai dengan yang diharapkan
  
- DetailTvShowViewModelTest
  - Memuat Tv Show
    - Memastikan data Tv Show tidak null
    - Memastikan jumlah data Tv Show sesuai dengan yang diharapkan
    
- MovieViewModelTest
  - Memuat list movie
    - Memastikan data List movie tidak null
    - Memastikan jumlah data List movie sesuai dengan yang diharapkan

- TvShowViewModelTest
  - Memuat list tv show
    - Memastikan data List Tv Show tidak null
    - Memastikan jumlah data List Tv Show sesuai dengan yang diharapkan

- Menampilkan data list movie
  - Klik bottom navigation untuk bagian movie
  - Memastikan rv_movie dalam keadaan tampil
  - Gulir rv_movie ke posisi data terakhir
  
- Menampilkan halaman detail movie
  - Klik bottom navigation untuk bagian movie
  - Memberi tindakan klik pada data pertama di rv_movie
  - Memastikan TextView untuk keterangan halaman (Top title) tampil sesuai yang diharapkan
  - Memastikan TextView untuk judul movie tampil sesuai yang diharapkan
  - Memastikan RatingBar untuk movie dapat ditampilkan
  - Memastikan TextView tanggal perilisan movie tampil sesuai yang diharapkan
  - Memastikan TextView synopsis movie tampil sesuai yang diharapkan
  - Memastikan ImageButton untuk Movie Favorit dapat ditampilkan
  - Memastikan WebView untuk menampilkan Trailer Movie dapat dilihat dan ditampilkan
  - Memastikan ImageView untuk movie backdrop dapat dilihat dan ditampilkan
  - Memastikan ImageView untuk poster movie dapat dilihat dan ditampilkan
  - Memberikan Tindakan klik pada tombol back di halaman detail movie

- Menampilkan data list tv show
  - Klik bottom navigation untuk bagian Tv Show
  - Memastikan rv_tvShow dalam keadaan tampil
  - Gulir rv_tvShow ke posisi data terakhir

- Menampilkan halaman detail tv show
  - Klik bottom navigation untuk bagian Tv Show
  - Memberi tindakan klik pada data pertama di rv_tvShow
  - Memastikan TextView untuk keterangan halaman (Top title) tampil sesuai yang diharapkan
  - Memastikan TextView untuk judul tv show tampil sesuai yang diharapkan
  - Memastikan RatingBar untuk tv show rating dapat ditampilkan
  - Memastikan TextView tanggal perilisan tv show tampil sesuai yang diharapkan
  - Memastikan TextView synopsis tv show tampil sesuai yang diharapkan
  - Memastikan ImageButton untuk tv show Favorit dapat ditampilkan
  - Memastikan WebView untuk menampilkan Trailer Movie dapat dilihat dan ditampilkan
  - Memastikan ImageView untuk movie backdrop dapat dilihat dan ditampilkan
  - Memastikan ImageView untuk poster movie dapat dilihat dan ditampilkan
  - Memastikan rv_seasonDetail dapat ditampilkan dengan baik
  - Memastikan rv_seasonDetail dapat digulir ke posisi terakhir
  - Memberikan Tindakan klik pada tombol back di halaman detail tv show

- Menampilkan hasil ekspansi dan menutup kembali daftar movie
  - Klik bottom navigation untuk bagian movie
  - Menekan tombol ekspansi pada halaman list movie untuk memperluas tampilan halaman list movie
  - Menekan tombol ekspansi kembali pada halaman list movie untuk mengembalikan tampilan halaman list movie (setengah halaman)

- Menampilkan hasil ekspansi dan menutup kembali daftar tv show
  - Klik bottom navigation untuk bagian Tv Show
  - Menekan tombol ekspansi pada halaman list tv show untuk memperluas tampilan halaman list tv show
  - Menekan tombol ekspansi kembali pada halaman list tv show untuk mengembalikan tampilan halaman list tv show (setengah halaman)
