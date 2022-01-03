class User:
    def __init__(self) -> None:
        pass


class Transactions:
    def __init__(self, id, time, tr_type, desc, amount, balance):
        self.id = id
        self.time = time
        self.tr_type = tr_type
        self.desc = desc
        self.amount = amount
        self.balance = balance


class Service:
    def __init__(self) -> None:
        pass


class Order:
    def __init__(self) -> None:
        pass


class BusService:
    def __init__(self,company,date,dep_time,dest,dep_terminal):
        self.company = company
        self.date = date
        self.dep_time = dep_time
        self.dep_time = dep_time
        self.dest = dest
        self.dep_terminal = dep_terminal


class HotelService:
    def __init__(self) -> None:
        pass


class FlightServive:
    def __init__(self) -> None:
        pass


class DomesticFlight(FlightServive):
    def __init__(self) -> None:
        super().__init__()


class InternationalFlight(FlightServive):
    def __init__(self) -> None:
        super().__init__()
