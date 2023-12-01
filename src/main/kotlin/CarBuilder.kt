interface CarBuilder {
    fun setModel(model: String): CarBuilder
    fun setColor(color: String): CarBuilder
    fun setEngine(engine: String): CarBuilder
    fun setYear(year: Int): CarBuilder
    fun build(): Car
}