public class Book {
        private int ID;
        private String title;
        private String author;
        private int yearOfPublishing;

        public Book(int ID, String title, String author, int yearOfPublishing) {
            this.ID = ID;
            this.title = title;
            this.author = author;
            this.yearOfPublishing = yearOfPublishing;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getYearOfPublishing() {
            return yearOfPublishing;
        }

        public void setYearOfPublishing(int yearOfPublishing) {
            this.yearOfPublishing = yearOfPublishing;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "ID=" + ID +
                    ", title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", yearOfPublishing=" + yearOfPublishing +
                    '}';
        }
    }

