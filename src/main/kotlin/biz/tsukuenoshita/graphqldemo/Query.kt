package biz.tsukuenoshita.graphqldemo

import biz.tsukuenoshita.graphqldemo.model.User
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component
import org.springframework.stereotype.Controller
import java.util.*

@Component
class Query: GraphQLQueryResolver {
    fun me() = User((Math.random() * 10000).toInt(), UUID.randomUUID().toString())
}