package io.philippeboisney.material.model.utils

import io.philippeboisney.material.model.Mail
import io.philippeboisney.material.model.Picture

object DataGenerator {

    val MAILS = listOf(
        Mail(
            "1",
            "Google Express - 15 mins agos",
            "https://randomuser.me/api/portraits/women/3.jpg",
            "Package shipped !",
            true,
            "Cucumber Mask Facial has shipped",
            listOf()
        ),
        Mail(
            "2",
            "Ali Connors - 25 mins ago",
            "https://randomuser.me/api/portraits/women/24.jpg",
            "Brunch this weekend?",
            false,
            "I'll be in your neighborhood doing errands...",
            listOf()
        ),
        Mail(
            "3",
            "Sandra Adams - 6 hrs ago",
            "https://randomuser.me/api/portraits/women/68.jpg",
            "Bonjour from Paris",
            false,
            "Here are some great shots from my trip to Paris this summer, it was great !",
            listOf(
                Picture("https://images.unsplash.com/photo-1486427944299-d1955d23e34d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1500&q=80"),
                Picture("https://images.unsplash.com/photo-1522093007474-d86e9bf7ba6f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=700&q=80"),
                Picture("https://images.unsplash.com/photo-1530130638890-a55dc7c827b5?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=700&q=80"),

                Picture("https://images.unsplash.com/photo-1471623432079-b009d30b6729?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1500&q=80"),
                Picture("https://images.unsplash.com/photo-1454386608169-1c3b4edc1df8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=668&q=80"),
                Picture("https://images.unsplash.com/photo-1503917988258-f87a78e3c995?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=668&q=80"),

                Picture("https://images.unsplash.com/photo-1458262488536-98366625ae59?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1496&q=80"),
                Picture("https://images.unsplash.com/photo-1500039436846-25ae2f11882e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1789&q=80"),
                Picture("https://images.unsplash.com/photo-1500482176473-ccba10e1e880?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=60")
            )
        ),
        Mail(
            "4",
            "Trevor Hansen - 12 hrs ago",
            "https://randomuser.me/api/portraits/men/52.jpg",
            "High school reunion?",
            false,
            "Could you go instead of me?",
            listOf()
        ),
        Mail(
            "5",
            "Britta Holt - 18 hrs ago",
            "https://randomuser.me/api/portraits/women/2.jpg",
            "Can't read the title?",
            false,
            "Maybe there is a description, maybe not.",
            listOf()
        )
    )

    fun findMailById(id: String) = MAILS.find { it.id == id }!!
}