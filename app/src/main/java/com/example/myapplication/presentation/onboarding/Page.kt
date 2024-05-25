package com.example.myapplication.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.myapplication.R



data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "merhaba",
        description = "buradaki kısımlar deneme amaçlı oluşturulup daha sonra değiştirilecektir.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "deneme",
        description = "buradaki kısımlar deneme amaçlı oluşturulup daha sonra değiştirilecektir.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "hello",
        description = "buradaki kısımlar deneme amaçlı oluşturulup daha sonra değiştirilecektir.",
        image = R.drawable.onboarding3
    )
)