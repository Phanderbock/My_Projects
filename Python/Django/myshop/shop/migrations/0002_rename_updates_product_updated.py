# Generated by Django 4.0.3 on 2022-06-03 16:46

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('shop', '0001_initial'),
    ]

    operations = [
        migrations.RenameField(
            model_name='product',
            old_name='updates',
            new_name='updated',
        ),
    ]
