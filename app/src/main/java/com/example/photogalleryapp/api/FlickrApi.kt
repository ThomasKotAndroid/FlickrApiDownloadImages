package com.example.photogalleryapp.api


import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

import retrofit2.http.Url


interface FlickrApi {



    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=your_api_key_here" +
                //"&api_key=$APIKEY"
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s")


    //   @GET("/")
   // fun fetchContents(): Call<String>


    fun fetchPhotos(): Call<FlickrResponse>

    @GET
    fun fetchUrlBytes(@Url url: String): Call<ResponseBody>
}
