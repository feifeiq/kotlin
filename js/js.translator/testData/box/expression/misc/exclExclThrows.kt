package foo


fun box(): String {
    val a: Int? = null

    try {
        if ((a!! + 3) == 3) return "fail1"
    }
    catch (e: Throwable) {
        return "OK"
    }
    return "fail2"
}