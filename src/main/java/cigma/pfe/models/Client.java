package cigma.pfe.models;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Client {
    private long id;
    private String  name;

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
//  public  Client(long id, String name){
      //  this.id=id;
    //    this.name=name;
   // }

}
