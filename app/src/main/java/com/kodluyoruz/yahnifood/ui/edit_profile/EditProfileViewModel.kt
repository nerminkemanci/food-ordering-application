package com.kodluyoruz.yahnifood.ui.edit_profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.kodluyoruz.yahnifood.data.ApiRepository
import com.kodluyoruz.yahnifood.data.entity.UsersResponse
import com.kodluyoruz.yahnifood.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel

class EditProfileViewModel @Inject constructor(var apiRepository: ApiRepository) : ViewModel(){

    fun getUser(user_id: Int): LiveData<Resource<UsersResponse>> {
        return apiRepository.getUserWithId(user_id)
    }

}