package com.example.youtubeapi.repository

import android.telecom.Call
import com.example.loco.network.result.Resource
import retrofit2.Response

open class BaseDataSource {
    protected suspend fun <T> getruslt(call: suspend () -> Response<T>): Resource<T> {
        try {
            val response = call()
            if (response.isSuccessful) {
                val body = response.body()

                if (body != null) return Resource.success(body)
            }else{
            return Resource.error(response.message(),response.body(),response.code())
            }
        }catch (e: Exception){
           return Resource.error(e.message ?:e.toString(),null,429)
        }
       return Resource.error(null,null,429)
    }

}
