class PackageListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_package_list)

        val recyclerView = findViewById<RecyclerView>(R.id.rv_packages)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Sample data
        val packages = listOf(
            PackageModel(
                name = "Paket All in One (AC Inverter)",
                description = "General Cleaning 2 jam, Cuci AC Inverter, Hydro Cleaning Kasur + Bantal",
                price = "Rp. 450.000",
                imageRes = R.drawable.img_package_1
            ),
            PackageModel(
                name = "Paket Bersih Bebas Tungau",
                description = "General Cleaning 2 jam, Hydro Cleaning (Senilai Maksimal Rp. 250.000)",
                price = "Rp. 350.000",
                imageRes = R.drawable.img_package_2
            ),
            PackageModel(
                name = "Paket Fogging Terbaik",
                description = "Fogging Disinfektan (maks 100m2) + Fogging Mobil (1 Unit)",
                price = "Rp. 275.000",
                imageRes = R.drawable.img_package_3
            )
        )

        recyclerView.adapter = PackageAdapter(packages)
    }
}
