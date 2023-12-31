package ClassesWithAttributes;

public class Product {
  public Product(){}
  public Product(int id, String name, String description, int stockAmount, double price){
    this._id=id;
    this._name=name;
    this._description=description;
    this._stockAmount=stockAmount;
    this._price=price;
  }
  private  String _name;
  private  String _description;
  private  double _price=1500;
  private  int _stockAmount;
  private int _id;
  private String _renk;
  private String _kod;
  public int getId(){
      return _id;
  }
  public void setId(int id){
      this._id=id; // this icinde bulundugum calss daki id=
  }

  public String get_name() {
    return _name;
  }

  public void set_name(String _name) {
    this._name = _name;
  }

  public String get_description() {
    return _description;
  }

  public void set_description(String _description) {
    this._description = _description;
  }

  public double get_price() {
    return _price;
  }

  public void set_price(double _price) {
    this._price = _price;
  }

  public int get_stockAmount() {
    return _stockAmount;
  }

  public void set_stockAmount(int _stockAmount) {
    this._stockAmount = _stockAmount;
  }

  public String get_renk() {
    return _renk;
  }

  public void set_renk(String _renk) {
    this._renk = _renk;
  }

  public String get_kod() {
    return _kod;
  }

  public void set_kod(String _kod) {
    this._kod = _kod;
  }
}
