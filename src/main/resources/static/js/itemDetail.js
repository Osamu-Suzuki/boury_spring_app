//1.ボタンをクリックすると入力フォームが開く

// idで対象の要素を取得し、変数に格納

// ボタン
const itemButton = document.getElementById("item_button");
const sellingButton = document.getElementById("selling_button");
const statusButton = document.getElementById("status_button");
const deleteButton = document.getElementById("delete_item_button");

// 非表示状態の要素
const itemInfo = document.getElementById("change_item_info");
const sellingPrice = document.getElementById("change_selling_price");
const itemStatus = document.getElementById("change_item_status");
const deleteItem = document.getElementById("delete_item_all_info");

// ボタンがクリックされた時の処理
itemButton.addEventListener('click', function() {
	itemInfo.style.display = 'block';
	sellingPrice.style.display = 'none';
	itemStatus.style.display = 'none';
	deleteItem.style.display = 'none';
});

sellingButton.addEventListener('click', function() {
	itemInfo.style.display = 'none';
	sellingPrice.style.display = 'block';
	itemStatus.style.display = 'none';
	deleteItem.style.display = 'none';
});

statusButton.addEventListener('click', function() {
	itemInfo.style.display = 'none';
	sellingPrice.style.display = 'none';
	itemStatus.style.display = 'block';
	deleteItem.style.display = 'none';
});

deleteButton.addEventListener('click', function() {
	itemInfo.style.display = 'none';
	sellingPrice.style.display = 'none';
	itemStatus.style.display = 'none';
	deleteItem.style.display = 'block';
});

// 2.ボタンをクリックすると表示されていた入力フォームが閉じる

const closeItemInfo = document.getElementById("close_item_info");
const closeSellingPrice = document.getElementById("close_selling_price");
const closeItemStatus = document.getElementById("close_item_status");
const closeDeleteItem = document.getElementById("close_delete_item");

// ボタンがクリックされた時の処理
closeItemInfo.addEventListener('click', function() {
	itemInfo.style.display = 'none';
});

closeSellingPrice.addEventListener('click', function() {
	sellingPrice.style.display = 'none';
});

closeItemStatus.addEventListener('click', function() {
	itemStatus.style.display = 'none';
});

closeDeleteItem.addEventListener('click', function() {
	deleteItem.style.display = 'none';
});