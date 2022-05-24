from django.urls import path, include
from django.contrib import admin


urlpatterns = [
    # post views
    path('admin/', admin.site.urls),
    path('blog/', include('blog.urls', namespace='blog')),
]
