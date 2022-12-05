package com.example.recipes_app.model;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<User> __insertionAdapterOfUser;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `User` (`fullName`,`email`,`phone`,`uId`,`isConnected`,`userUrl`,`updateDate`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        if (value.getFullName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getFullName());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getEmail());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPhone());
        }
        if (value.getUId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUId());
        }
        if (value.getIsConnected() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getIsConnected());
        }
        if (value.getUserUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUserUrl());
        }
        if (value.getUpdateDate() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getUpdateDate());
        }
      }
    };
  }

  @Override
  public void insertAll(final User... users) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUser.insert(users);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
