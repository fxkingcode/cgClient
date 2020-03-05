package com.example.chatground2.view.detailForum

import android.content.Intent
import com.example.chatground2.Model.DTO.ForumDto
import com.example.chatground2.Model.DTO.UserDto
import com.example.chatground2.adapter.adapterContract.CommentsAdapterContract
import com.example.chatground2.adapter.adapterContract.ForumsAdapterContract
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail_forum.*

interface DetailForumContract {
    interface IDetailForumPresenter{
        var idx:Int?
        var adapterModel: CommentsAdapterContract.Model?
        var adapterView: CommentsAdapterContract.View?
        fun detailForum()
        fun onCommentSendClick()
        fun onPathCheck(imagePath: String?)
        fun galleryResult(data: Intent?)
        fun checkCameraPermission()
        fun deleteImage()
        fun onCameraClick()
        fun closeCursor()
        fun deleteForum()
        fun modifyForum()
        fun onRecommendClick()
        fun recommendForum()
    }

    interface IDetailForumView{
        fun setCameraImage(path:String?)
        fun deleteDialog()
        fun createDialog()
        fun progressVisible(boolean: Boolean)
        fun toastMessage(text:String)
        fun finishActivity()
        fun openGallery()
        fun setDateText(text: String)
        fun setTitleText(text: String)
        fun setContentText(text: String)
        fun setProfileImage(path: String)
        fun setNicknameText(text: String)
        fun setCommentNumText(text: String)
        fun setRecommendText(text: String)
        fun setRecommendButtonText(text: String)
        fun setImage0(path: String)
        fun setImage1(path: String)
        fun setImage2(path: String)
        fun setImage3(path: String)
        fun setImage4(path: String)
        fun setDeleteForumVisible(boolean: Boolean)
        fun setModifyForumVisible(boolean: Boolean)
        fun enterModifyForum(idx: Int)
        fun getCommentMessageText():String
        fun setCommentMessageText(text: String)
        fun recommendDialog(boolean: Boolean)
        fun setEnable(boolean: Boolean)
    }

    interface Listener
    {
        fun onWriteCommentSuccess()
        fun onWriteCommentFailure()
        fun onDetailForumSuccess(forumDto: ForumDto?)
        fun onDetailForumFailure()
        fun onDeleteForumSuccess()
        fun onDeleteForumFailure()
        fun onRecommendForumSuccess()
        fun onRecommendForumFailure()
        fun onFailure()
    }
}