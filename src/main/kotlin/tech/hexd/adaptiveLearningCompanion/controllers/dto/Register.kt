package tech.hexd.adaptiveLearningCompanion.controllers.dto

data class RegisterRequest(val username: String, val password: String)

data class RegisterResponse(val message: String)
