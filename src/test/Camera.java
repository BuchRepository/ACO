package test;

class Camera {
    String title;
    String author;

    public Camera (String title, String author){
        this.title=title;
        this.author=author;
    }
    public  void setTitle (String title){
        this.title=title;
    }

    public String getTitle (){
        return (title);
    }

    public void print(){
    System.out.println("Название "+title+" ,Автор -"+author);
    }
}


