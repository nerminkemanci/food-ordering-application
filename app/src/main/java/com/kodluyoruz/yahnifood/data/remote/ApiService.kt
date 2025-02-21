package com.kodluyoruz.yahnifood.data.remote

import com.kodluyoruz.yahnifood.data.entity.*
import com.kodluyoruz.yahnifood.data.entity.dtos.OrderDto
import com.kodluyoruz.yahnifood.data.entity.dtos.UserDto
import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    //http://localhost:3000/users?email=yusuf@hotmail.com&name=Yusuf

    @GET("users")
    suspend fun getUser(@Query("id") id:Int
    ): Response<UsersResponse>

    @GET("users")
    suspend fun login (@Query("email") email:String, @Query("password") password:String
    ): Response<UsersResponse>

    @POST("users")
    suspend fun register(@Body() user: UserDto
    ): Response <UsersItem>

    @GET("restaurants")
    suspend fun getRestaurants(@Query("address.district") district: String
    ): Response <RestaurantsResponse>

    @GET("orders")
    fun getOrders(@Query("user_id") user_id:Int
    ): Response <OrdersResponse>

    @POST("restaurants")
    suspend fun postRestaurant(@Body() restaurant: RestaurantsItem
    ): Response <RestaurantsResponse>

    @POST("users")
    fun postAddress(@Body() address: Address): Response <Address>

    @POST("orders")
    suspend fun postOrder(@Body() order: OrderDto): Response<OrdersResponse>

    @PUT("restaurants/{id}")
    suspend fun addMeal(@Path("id") id:String, @Body restaurant: RestaurantsItem) : Response<RestaurantsItem>

    @PUT("users/{id}")
    suspend fun updateUser(@Path("id") id:String, @Body user: UsersItem) : Response<UsersItem>

    @GET("restaurants")
    suspend fun getAllRestaurants():Response<RestaurantsResponse>

}


