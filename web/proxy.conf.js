const PROXY_CONFIG = [
    {
        context: [
            "/client",
        ],
        target: "http://localhost:8080",
        secure: false
    }
]

module.exports = PROXY_CONFIG;
