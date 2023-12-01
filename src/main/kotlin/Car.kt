data class Car(
    val model: String,
    val color: String,
    val engine: String,
    val year: Int
) {
    // Concrete Car Builder
    class Builder : CarBuilder {
        private var model: String = ""
        private var color: String = ""
        private var engine: String = ""
        private var year: Int = 0

        override fun setModel(model: String): CarBuilder {
            this.model = model
            return this
        }

        override fun setColor(color: String): CarBuilder {
            this.color = color
            return this
        }

        override fun setEngine(engine: String): CarBuilder {
            this.engine = engine
            return this
        }

        override fun setYear(year: Int): CarBuilder {
            this.year = year
            return this
        }

        override fun build(): Car {
            return Car(model, color, engine, year)
        }
    }
}