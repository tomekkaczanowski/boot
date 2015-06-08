package stubs.whateverService

io.codearte.accurest.dsl.GroovyDsl.make {
    request {
        method "GET"
        url "/users"
        body('''
                    {
                    "clientPesel":"1234567890",
                    "loanAmount":99999}
                '''
        )
        headers {
            header("Content-Type", "application/vnd.fraud.v1+json")

        }

    }
    response {
        status 200
        body( """{
    "fraudCheckStatus": "FRAUD",
    "rejectionReason": "Amount too high"
}""")
        headers {
            header('Content-Type': 'application/vnd.fraud.v1+json')

        }

    }

}