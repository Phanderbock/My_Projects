from django.urls import path
from . import views

app_name = 'images'

urlpatterns = [
    path('create/', views.images_created, name='create'),
]
