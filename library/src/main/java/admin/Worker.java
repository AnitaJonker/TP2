package admin;

/**
 * Created by student on 2016/03/30.
 */
public class Worker {
    private String name;
    private String surname;
    private String address;


    private Worker()
    {


    }

    private Worker(Builder builder)
    {
        this.name = builder.name;
        this.surname = builder.surname;
        this.address = builder.address;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }


    public static class Builder {

        private String name;
        private String surname;
        private String address;

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }


        public Builder surname(String surname)
        {
            this.surname = surname;
            return this;
        }


        public Builder address(String address)
        {
            this.address = address;
            return this;
        }


        public Worker build()
        {
            return new Worker(this);
        }
    }

    }
