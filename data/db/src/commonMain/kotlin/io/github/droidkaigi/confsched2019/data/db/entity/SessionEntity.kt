package io.github.droidkaigi.confsched2019.data.db.entity

interface SessionEntity {
    var id: String
    var title: String
    var englishTitle: String?
    var desc: String
    var stime: Long
    var etime: Long
    var sessionFormat: String?
    val language: LanguageEntity?
    val category: CategoryEntity?
    val intendedAudience: String?
    val videoUrl: String?
    val slideUrl: String?
    val isInterpretationTarget: Boolean
    val room: RoomEntity?
    val message: MessageEntity?
    val isServiceSession: Boolean
    val sessionType: String?
}
