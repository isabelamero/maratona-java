package javacore.Minterfaces.dominio;

public interface DataLoader {
    //Todos os atributos em uma interface são CONSTANTES
    public static final int MAX_DATA_SIZE = 10;
      void load();

      default void checkPermission() {
          System.out.println("Fazendo checagem de permissões");
      }

      public static void retrieveMaxDataSize() {
          System.out.println("Dentro do retrieveMaxDataSize na interface");
      }
}
