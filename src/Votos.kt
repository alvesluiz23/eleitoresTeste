class Votos constructor(
    private val totalEleitores: Int,
    private val validos: Int,
    private val brancos: Int,
    private val nulos: Int
) {
    fun percentualValidos(): Double {
        return (validos * 100.0) / totalEleitores
    }

    fun percentualBrancos(): Double {
        return (brancos * 100.0) / totalEleitores
    }

    fun percentualNulos(): Double {
        return (nulos * 100.0) / totalEleitores
    }


}