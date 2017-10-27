## Notes

* You need to contruct the sql with string concatenation/placeholder with String.format. prepared statement is for the column values not for table name.

### sqlite table joining
* **query statement: **
    ```java
    StringBuilder query = new StringBuilder();
    query.append("SELECT track, title, albums.name as album, artists.name as artist ");
    query.append("FROM songs, albums, artists ");
    query.append("WHERE songs.album = albums._id ");
    query.append("AND albums.artist = artists._id ");
    query.append("ORDER BY artists.name, albums.name, songs.track");
    ```
  OR
    ```java
    StringBuilder query = new StringBuilder();
    query.append("SELECT track, title, albums.name as album, artists.name as artist FROM songs ");
    query.append("INNER JOIN albums ON songs.album = albums._id ");
    query.append("INNER JOIN artists ON albums.artist = artists._id ");
    query.append("ORDER BY artists.name, albums.name, songs.track");
    ```

* **getting resultset: **

    ```java
    int track = resultSet.getInt("track");
    String title = resultSet.getString("title");
    String album = resultSet.getString("album");
    String artist = resultSet.getString("artist");
    ```

* **Links:**
    * [SQLite/JDBC inner join](https://stackoverflow.com/questions/7620792/sqlite-jdbc-inner-join)
    * [How do you select from multiple tables in sqlite in Java?](https://stackoverflow.com/questions/25098939/how-do-you-select-from-multiple-tables-in-sqlite-in-java)
