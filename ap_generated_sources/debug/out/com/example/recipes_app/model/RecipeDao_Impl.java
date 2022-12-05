package com.example.recipes_app.model;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RecipeDao_Impl implements RecipeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Recipe> __insertionAdapterOfRecipe;

  private final EntityDeletionOrUpdateAdapter<Recipe> __deletionAdapterOfRecipe;

  public RecipeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRecipe = new EntityInsertionAdapter<Recipe>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Recipe` (`id`,`name`,`method`,`ingredients`,`type`,`recipeUrl`,`username`,`updateDate`,`isDeleted`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Recipe value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getMethod() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMethod());
        }
        if (value.getIngredients() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getIngredients());
        }
        if (value.getType() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getType());
        }
        if (value.getRecipeUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getRecipeUrl());
        }
        if (value.getUsername() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getUsername());
        }
        if (value.getUpdateDate() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getUpdateDate());
        }
        if (value.getIsDeleted() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getIsDeleted());
        }
      }
    };
    this.__deletionAdapterOfRecipe = new EntityDeletionOrUpdateAdapter<Recipe>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Recipe` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Recipe value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
  }

  @Override
  public void insertAll(final Recipe... recipes) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRecipe.insert(recipes);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Recipe recipe) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfRecipe.handle(recipe);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Recipe> getAll() {
    final String _sql = "select * from Recipe";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfMethod = CursorUtil.getColumnIndexOrThrow(_cursor, "method");
      final int _cursorIndexOfIngredients = CursorUtil.getColumnIndexOrThrow(_cursor, "ingredients");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfRecipeUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "recipeUrl");
      final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
      final int _cursorIndexOfUpdateDate = CursorUtil.getColumnIndexOrThrow(_cursor, "updateDate");
      final int _cursorIndexOfIsDeleted = CursorUtil.getColumnIndexOrThrow(_cursor, "isDeleted");
      final List<Recipe> _result = new ArrayList<Recipe>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Recipe _item;
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpMethod;
        if (_cursor.isNull(_cursorIndexOfMethod)) {
          _tmpMethod = null;
        } else {
          _tmpMethod = _cursor.getString(_cursorIndexOfMethod);
        }
        final String _tmpIngredients;
        if (_cursor.isNull(_cursorIndexOfIngredients)) {
          _tmpIngredients = null;
        } else {
          _tmpIngredients = _cursor.getString(_cursorIndexOfIngredients);
        }
        final String _tmpType;
        if (_cursor.isNull(_cursorIndexOfType)) {
          _tmpType = null;
        } else {
          _tmpType = _cursor.getString(_cursorIndexOfType);
        }
        final String _tmpUsername;
        if (_cursor.isNull(_cursorIndexOfUsername)) {
          _tmpUsername = null;
        } else {
          _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        }
        _item = new Recipe(_tmpId,_tmpName,_tmpMethod,_tmpIngredients,_tmpType,_tmpUsername);
        if (_cursor.isNull(_cursorIndexOfRecipeUrl)) {
          _item.recipeUrl = null;
        } else {
          _item.recipeUrl = _cursor.getString(_cursorIndexOfRecipeUrl);
        }
        final Long _tmpUpdateDate;
        if (_cursor.isNull(_cursorIndexOfUpdateDate)) {
          _tmpUpdateDate = null;
        } else {
          _tmpUpdateDate = _cursor.getLong(_cursorIndexOfUpdateDate);
        }
        _item.setUpdateDate(_tmpUpdateDate);
        final String _tmpIsDeleted;
        if (_cursor.isNull(_cursorIndexOfIsDeleted)) {
          _tmpIsDeleted = null;
        } else {
          _tmpIsDeleted = _cursor.getString(_cursorIndexOfIsDeleted);
        }
        _item.setIsDeleted(_tmpIsDeleted);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
