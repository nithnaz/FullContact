	INSERT INTO `stays` (`stay_id`, `stay_name`, `stay_type`, `dest_type`, `loc`) VALUES
	(1, 'Pink Mountain resort', 'Homestay', 'Hillside', _binary 0x0000000001010000000000000000001040000000000000F03F),
	(2, 'Orange Baech Stay', 'Resort', 'Beachwaters', _binary 0x0000000001010000000000000000000840000000000000F03F),
	(3, 'Apple Resort', 'cottages', 'Beach', _binary 0x0000000001010000000000000000000040000000000000F03F),
	(4, 'Red Beach Hotel', 'Hotel', 'Hillside', _binary 0x000000000101000000000000000000F03F000000000000F03F),
	(5, 'B Stay', 'cottages', 'Hillside', _binary 0x0000000001010000000000000000001440000000000000F03F),
	(6, 'C Cottage', 'cottages', 'Hillside', _binary 0x0000000001010000000000000000001840000000000000F03F),
	(7, 'D Resort', 'Resort', 'Beach', _binary 0x00000000010100000000000000000018400000000000001040),
	(8, 'E Resort', 'Homestay', 'Beachwaters', _binary 0x0000000001010000000000000000001C40000000000000F03F),
	(9, 'F Hotel', 'Hotel', 'Beach', _binary 0x0000000001010000000000000000002040000000000000F03F),
	(10, 'G Hotel', 'Hotel', 'Beachwaters', _binary 0x00000000010100000000000000000020400000000000000840);

	INSERT INTO `customers` (`cust_id`, `cust_name`) VALUES
	(1, 'John'),
	(2, 'Vikki');

INSERT INTO `bookings` (`cust_id`, `stay_id`, `rating`) VALUES
	(1, 1, 3),
	(2, 2, 3),
	(1, 3, 4),
	(2, 4, 2),
	(1, 5, 5),
	(1, 6, 3),
	(1, 7, 3),
	(1, 8, 4),
	(2, 9, 3),
	(1, 9, 3),
	(2, 10, 4);
