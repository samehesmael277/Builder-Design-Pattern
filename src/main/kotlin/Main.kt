fun main(args: Array<String>) {
    val car: Car = Car.Builder()
        .setModel("Sedan")
        .setColor("Blue")
        .setEngine("V6")
        .setYear(2023)
        .build()

    println(car)
}