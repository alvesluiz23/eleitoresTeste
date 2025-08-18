fun main() {
        val votos = Votos(1000, 800, 150, 50)

        println("Percentual de votos válidos: %.2f%%".format(votos.percentualValidos()))
        println("Percentual de votos brancos: %.2f%%".format(votos.percentualBrancos()))
        println("Percentual de votos nulos: %.2f%%".format(votos.percentualNulos()))
}