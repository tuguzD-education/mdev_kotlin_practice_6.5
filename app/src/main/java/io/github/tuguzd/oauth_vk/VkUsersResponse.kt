package io.github.tuguzd.oauth_vk

class VkUsersResponse() {
    var response: List<VkUser>? = null

    constructor(response: List<VkUser>) : this() {
        this.response = response
    }
}
