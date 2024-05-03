import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ServiceLayer implements CarLotService {


    @Override
    public Car getACar(String VIN) {
        return CarLotDAO.getCar(VIN);
    }

    @Override
    public List<Car> getAllCars() {
        return CarLotDAO.getAllCars();
    }

    @Override
    public List<Car> getCarsByColor(String color) {
        List<Car> cars = getAllCars();
        for (int i = cars.size() - 1; i > 0; i--) {
            if (cars.get(i).getColor() == color) {
                cars.remove(i);
            }
        }
        return cars;
    }

    @Override
    public List<Car> getCarsInBudget(BigDecimal maxPrice) {
        List<Car> cars = getAllCars();
        for (int i = cars.size() - 1; i > 0; i--) {
            BigDecimal carPrice = cars.get(i).getPrice();
            if (carPrice.compareTo(maxPrice) == 1) {
                cars.remove(i);
            }
        }
        return cars;
    }

    @Override
    public List<Car> getCarByMakeAndModel(String make, String model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCarByMakeAndModel'");
    }

    @Override
    public BigDecimal discountCar(String VIN, BigDecimal percentDiscount) throws NoSuchCarException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'discountCar'");
    }

    @Override
    public CarKey sellCar(String VIN, BigDecimal cashPaid)
            throws NoSuchCarException, OverpaidPriceException, UnderpaidPriceException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sellCar'");
    }
}