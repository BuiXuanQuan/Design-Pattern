package Order;

import Chef.ManagerChef;


    public class OrderFood {

        ManagerChef manage;
        public OrderFood(ManagerChef manage) {
            this.manage = manage;
        }
        public Icommand getOrder(int index) {
            switch(index) {
                case 1: return new MakeCake(manage.getRandomChefCanMake(index));
                case 2: return new MakeBread(manage.getRandomChefCanMake(index));
                case 3: return new MakeChicken(manage.getRandomChefCanMake(index));
                case 4: return new MakeCoffee(manage.getRandomChefCanMake(index));
                case 5: return new MakeEgg(manage.getRandomChefCanMake(index));
                case 6: return new MakeFish(manage.getRandomChefCanMake(index));
                case 7: return new MakeHamburger(manage.getRandomChefCanMake(index));
                case 8: return new MakeSteak(manage.getRandomChefCanMake(index));
                case 9: return new MakeToast(manage.getRandomChefCanMake(index));
                case 10: return new MakePizza(manage.getRandomChefCanMake(index));
                default: return null;
            }
        }



}
