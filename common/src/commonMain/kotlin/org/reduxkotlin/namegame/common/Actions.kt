package org.reduxkotlin.namegame.common

import org.reduxkotlin.namegame.common.repo.ItemsHolder
import org.reduxkotlin.Thunk

sealed class Actions {

    class FetchingItemsStartedAction
    data class FetchingItemsSuccessAction(val itemsHolder: ItemsHolder)
    data class FetchingItemsFailedAction(val message: String)

    data class NamePickedAction(val name: String)

    class NextQuestionAction

    class GameCompleteAction

    class ResetGameStateAction

    data class StartQuestionTimerAction(val initialValue: Int)
    class DecrementCountDownAction
    class TimesUpAction


    class LoadAllSettingsAction
    data class SettingsLoadedAction(val settings: UserSettings)
    data class ChangeNumQuestionsSettingsAction(val num: Int)
    data class ChangeCategorySettingsAction(val categoryId: QuestionCategoryId)
    data class ChangeMicrophoneModeSettingsAction(val enabled: Boolean)

    open class ThrottledAction(val waitTimeMs: Long, val thunk: Thunk<AppState>)

}

