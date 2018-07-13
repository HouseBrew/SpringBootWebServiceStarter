CREATE TABLE `restaurant` (
 `restaurant_id` varchar(255) NOT NULL,
 `category` varchar(255) DEFAULT NULL,
 `created_on` date DEFAULT NULL,
 `active` int(11) DEFAULT NULL,
 `name` varchar(255) DEFAULT NULL,
 `updated_on` date DEFAULT NULL,
 PRIMARY KEY (`restaurant_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- Seed
INSERT INTO `restaurant` (`restaurant_id`, `category`, `created_on`, `active`, `name`, `updated_on`) VALUES
('c3a8067e-8577-11e8-9b80-3bb6df3e9636', 'FAST_FOOD', '2018-07-12', 1, 'Fairwood', '2018-07-12'),
('c3a81042-8577-11e8-9b80-3bb6df3e9636', 'WESTERN', '2018-07-12', 1, 'Outback', '2018-07-12');