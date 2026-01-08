package com.hihihihi.domain.model

enum class Appellation(
    val id: String,
    val title: String,
    val description: String
) {
    LITTLE_CLOUD("little_cloud", "꼬마 구름", "아직 책을 읽지 않은 시작 전 상태"),
    FIRST_STEP_CLOUD("first_step_cloud", "첫걸음 구름", " 첫 책을 완독하며 독서를 시작한 상태\n(책 1권 완독 시 자동 해금)");

    companion object {
        fun fromId(id: String): Appellation? = entries.find { it.id == id }
    }
}
