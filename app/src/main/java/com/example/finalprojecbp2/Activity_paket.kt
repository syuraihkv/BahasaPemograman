class PackageAdapter(private val packages: List<PackageModel>) :
    RecyclerView.Adapter<PackageAdapter.PackageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PackageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_package, parent, false)
        return PackageViewHolder(view)
    }

    override fun onBindViewHolder(holder: PackageViewHolder, position: Int) {
        val pkg = packages[position]
        holder.bind(pkg)
    }

    override fun getItemCount() = packages.size

    class PackageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imgPackage: ImageView = itemView.findViewById(R.id.img_package)
        private val tvName: TextView = itemView.findViewById(R.id.tv_package_name)
        private val tvDescription: TextView = itemView.findViewById(R.id.tv_package_description)
        private val tvPrice: TextView = itemView.findViewById(R.id.tv_package_price)
        private val btnOrder: Button = itemView.findViewById(R.id.btn_order)

        fun bind(pkg: PackageModel) {
            imgPackage.setImageResource(pkg.imageRes)
            tvName.text = pkg.name
            tvDescription.text = pkg.description
            tvPrice.text = pkg.price
            btnOrder.setOnClickListener {
                // Handle order click
            }
        }
    }
}
