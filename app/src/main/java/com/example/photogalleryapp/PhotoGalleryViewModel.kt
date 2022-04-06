package com.example.photogalleryapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class PhotoGalleryViewModel: ViewModel() {
    val galleryItemLiveData:LiveData<List<GalleryItem>>

    init{
        galleryItemLiveData = FlickrFetcher().fetchPhotos()
    }


}