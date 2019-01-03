package biz.tsukuenoshita.graphqldemo.integration.gateway

import biz.tsukuenoshita.graphqldemo.model.User

interface UserApiGateway {
    fun get(name: String): User
}