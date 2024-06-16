

fun main() {
    post {
        url("https://example.com/api")
        header(mapOf("Content type" to "application/json", "Authorization" to "Bearer token"))
        body("{\"name\": \"John\", \"age\": 30}")
    }.also { println(it) }

    get {
        url("https://example.com/api")
        header(mapOf("Content type" to "application/json", "Authorization" to "Bearer token"))
        body("{\"name\": \"John\", \"age\": 30}")
    }.also { println(it) }

    put {
        url("https://example.com/api")
        header(mapOf("Content type" to "application/json", "Authorization" to "Bearer token"))
        body("{\"name\": \"John\", \"age\": 30}")
    }.also { println(it) }

    delete {
        url("https://example.com/api")
        header(mapOf("Content type" to "application/json", "Authorization" to "Bearer token"))
        body("{\"name\": \"John\", \"age\": 30}")
    }.also { println(it) }
}

data class HttpRequest(
    val method: String,
    val url: String,
    val headers: Map<String, String>,
    val body: String?
)

class RequestBuilder{

    private var url: String? = null
    private var headers: Map<String, String>? = null
    private var body: String? = null
    fun url(url: String) = apply{ this.url = url }
    fun header(headers: Map<String, String>) = apply{ this.headers = headers }

    fun body(body: String) = apply{ this.body = body }
    fun build(method: String) : HttpRequest {
        return HttpRequest(
            method = method,
            url = this.url!!,
            headers = this.headers!!,
            body = this.body
        )
    }
}

fun post(initializer: RequestBuilder.() -> Unit) : HttpRequest {
    return RequestBuilder().apply(initializer).build("POST")
}

fun get(initializer: RequestBuilder.() -> Unit) : HttpRequest {
    return RequestBuilder().apply(initializer).build("GET")
}

fun put(initializer: RequestBuilder.() -> Unit) : HttpRequest {
    return RequestBuilder().apply(initializer).build("PUT")
}

fun delete(initializer: RequestBuilder.() -> Unit) : HttpRequest {
    return RequestBuilder().apply(initializer).build("DELETE")
}


