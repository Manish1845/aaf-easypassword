package io.github.hanjoongcho.easypassword.models

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Created by Administrator on 2017-11-15.
 */
open class Account (
        var title: String = "",
        var summary: String = "",
//        var theme: Theme = Theme.white,

        // web
        // credit_card
        // home
        var category: String = "",
        var id: String = "",
        var password: String = "",
        var passwordStrengthLevel: Int = -1,
        @PrimaryKey var sequence: Int = -1
) : RealmObject() {

    companion object {
        const val TAG = "Account"
    }
}