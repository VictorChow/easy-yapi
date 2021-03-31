package com.itangcent.idea.plugin.utils


object RestEasyClassName {

    var REST_CONTROLLER_ANNOTATION: Set<String> =
            mutableSetOf("org.springframework.stereotype.Component", "javax.ws.rs.Path")

    //annotations
    const val REQUEST_MAPPING_ANNOTATION = "javax.ws.rs.Path"
    const val REQUEST_PARAM_ANNOTATION = "javax.ws.rs.QueryParam"
    const val PATH_VARIABLE_ANNOTATION = "javax.ws.rs.PathParam"

    const val GET_MAPPING = "javax.ws.rs.GET"
    const val POST_MAPPING = "javax.ws.rs.POST"
    const val PUT_MAPPING = "javax.ws.rs.PUT"
    const val DELETE_MAPPING = "javax.ws.rs.DELETE"
    const val PATCH_MAPPING = "javax.ws.rs.PATCH"

    val REST_REQUEST_MAPPING_ANNOTATIONS: Set<String> = setOf(REQUEST_MAPPING_ANNOTATION,
            GET_MAPPING,
            DELETE_MAPPING,
            POST_MAPPING,
            PUT_MAPPING,
            PATCH_MAPPING
    )

    val REST_HTTP_METHOD_ANNOTATIONS: Set<String> = setOf(
            GET_MAPPING,
            DELETE_MAPPING,
            POST_MAPPING,
            PUT_MAPPING,
            PATCH_MAPPING
    )
}
