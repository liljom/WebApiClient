package entities

/**
 * Created by liljom on 2017. 06. 05..
 */

data class Post(val userID: Int,
                val id: Int,
                var title: String,
                var body: String)