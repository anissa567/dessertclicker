🍰 Dessert Clicker
Game clicker Android yang fun dan sederhana! Klik dessert untuk mendapatkan uang dan unlock berbagai jenis dessert baru. Dibuat dengan Jetpack Compose dan Material Design 3.
Dessert Clicker adalah game idle clicker dimana kamu bisa mengumpulkan uang dengan mengklik dessert. Semakin banyak klik, semakin banyak uang yang didapat, dan semakin banyak dessert baru yang bisa dibuka. Aplikasi ini dibuat sebagai project pembelajaran untuk memahami Jetpack Compose dan State Management di Android.

✨ Fitur
1. Gameplay Interaktif – Ketuk dessert untuk menambah pendapatan.
2. Pilihan Dessert Beragam – Tersedia 13 jenis dessert yang bisa kamu buka seiring progres permainan.
3. Pelacakan Pendapatan – Lihat total penghasilan dan jumlah dessert yang sudah terjual.
4. State Management – Menggunakan ViewModel agar data tetap aman saat layar diputar atau aplikasi berubah state.
5. Desain Material 3 – Tampilan modern dengan sentuhan Material You.
6. Fitur Share – Bagikan progres atau pencapaianmu ke teman-teman.
7. Activity Lifecycle – Dilengkapi logging untuk membantu memahami alur lifecycle di Android.

🛠️ Tech Stack
1. Bahasa Pemrograman: Kotlin
2. UI Framework: Jetpack Compose
3. Arsitektur: MVVM (Model–View–ViewModel)
4. State Management: StateFlow dan Compose State
5. Material Design: Komponen Material 3
6. Build System: Gradle dengan Kotlin DSL

📦 Struktur Project
pnm.tigade.dessert/
├── data/
│   ├── Datasource.kt          # Data sumber dessert
│   └── DessertUiState.kt      # State UI aplikasi
├── ui/
│   ├── DessertViewModel.kt    # ViewModel untuk state management
│   └── theme/                 # Tema aplikasi (warna, typography)
└── MainActivity.kt            # Entry point aplikasi

🎮 Cara Main
1. Buka aplikasi Dessert Clicker
2. Klik gambar dessert yang muncul di tengah layar
3. Setiap klik akan menambah revenue sesuai harga dessert
4. Dessert baru akan otomatis unlock setelah mencapai jumlah penjualan tertentu
5. Lihat total revenue dan desserts sold di bagian bawah
6. Gunakan tombol share di top bar untuk bagikan progress

💡 Yang Dipelajari
Project ini mendemonstrasikan beberapa konsep penting dalam Android Development:

Jetpack Compose untuk membuat UI modern
State management dengan ViewModel dan StateFlow
Implementasi MVVM architecture
Material Design 3 theming
Activity lifecycle di Android
Intent sharing untuk berbagi konten
Penggunaan data class dan Kotlin best practices

🤝 Kontribusi
Kontribusi sangat diterima! Jika kamu menemukan bug atau punya ide untuk fitur baru:
1. Fork repository ini
2. Buat branch baru (git checkout -b feature/FiturBaru)
3. Commit perubahan (git commit -m 'Menambah fitur baru')
4. Push ke branch (git push origin feature/FiturBaru)
5. Buat Pull Request

📝 Lisensi
Project ini menggunakan MIT License. Bebas digunakan untuk belajar dan dikembangkan lebih lanjut.

👨‍💻 Author
Anissa Puji Ryandhani
GitHub: @anissa567

Acknowledgments
1. Dibuat sebagai bagian dari pembelajaran Android Basics with Compose
2. Terinspirasi dari Google Codelabs
3. Material Design guidelines dari Google


⭐ Jangan lupa star repository ini jika bermanfaat!
💬 Ada pertanyaan? Buka issue atau hubungi saya!

