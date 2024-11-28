import com.google.gson.annotations.SerializedName

data class NewsResponse(
    @SerializedName("hits") val hits: MutableList<Hit>,
    @SerializedName("hitsPerPage") val hitsPerPage: Int,
    @SerializedName("nbHits") val nbHits: Int,
    @SerializedName("nbPages") val nbPages: Int,
    @SerializedName("page") val page: Int,
    @SerializedName("params") val params: String
)

data class Hit(
    @SerializedName("author") val author: String?,
    @SerializedName("title") val title: String? = String(),
    @SerializedName("story_title") val storyTitle: String? = String(),
    @SerializedName("url") val url: String?,
    @SerializedName("story_url") val storyUrl: String?,
    @SerializedName("created_at") val createdAt: String?,
    @SerializedName("num_comments") val numComments: Int?,
    @SerializedName("points") val points: Int?,
    @SerializedName("objectID") val objectId: String
)
