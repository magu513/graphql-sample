package biz.tsukuenoshita.graphqldemo.graphql

import biz.tsukuenoshita.graphqldemo.integration.gateway.UserApiGateway
import biz.tsukuenoshita.graphqldemo.model.User
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.stereotype.Controller
import java.util.*

@Component
class Query: GraphQLQueryResolver {
    @Autowired
    lateinit var userApiGateway: UserApiGateway

    fun me() = userApiGateway.get("")
}