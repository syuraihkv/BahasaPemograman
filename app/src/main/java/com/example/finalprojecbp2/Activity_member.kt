class MembershipActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_membership)

        // Handle back button
        findViewById<ImageView>(R.id.btn_back).setOnClickListener {
            onBackPressed()
        }

        // Handle clickable items
        findViewById<TextView>(R.id.tv_about_program).setOnClickListener {
            // Open "Tentang Membership Program" details
        }

        findViewById<TextView>(R.id.tv_terms).setOnClickListener {
            // Open "Syarat & Ketentuan" details
        }
    }
}
