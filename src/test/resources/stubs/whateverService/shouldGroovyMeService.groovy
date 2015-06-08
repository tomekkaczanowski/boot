io.codearte.accurest.dsl.GroovyDsl.make {
    request {
        method "PUT"
        url "/users/12345"
        headers {
            header("Content-Type", "application/json")

        }

    }
    response {
        status 200
        body( """
    "user": {
    "firstname":"John",
    "lastname":"Doe"
}""")
        headers {
            header('Content-Type': 'application/json')

        }

    }

}