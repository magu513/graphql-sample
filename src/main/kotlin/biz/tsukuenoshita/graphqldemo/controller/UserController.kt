package biz.tsukuenoshita.graphqldemo.controller

import biz.tsukuenoshita.graphqldemo.model.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

/**
 * API連携サンプル用のエンドポイント
 */
@RestController
@RequestMapping("/user")
class UserController {
    @GetMapping
    fun get() = User((Math.random() * 10000).toInt(), UUID.randomUUID().toString())
}